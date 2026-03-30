package lt.viko.eif.kskrebe.server.db;

import liquibase.Contexts;
import liquibase.LabelExpression;
import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.resource.ClassLoaderResourceAccessor;

import java.sql.Connection;

public class DatabaseMigrationRunner {

    public void migrate() {
        try (Connection connection = DatabaseUtil.getConnection()) {

            Database database = DatabaseFactory.getInstance()
                    .findCorrectDatabaseImplementation(new JdbcConnection(connection));

            Liquibase liquibase = new Liquibase(
                    "db/changelog/db.changelog-master.xml",
                    new ClassLoaderResourceAccessor(),
                    database
            );

            liquibase.update(new Contexts(), new LabelExpression());

            System.out.println("Liquibase migracijos įvykdytos sėkmingai.");

        } catch (Exception e) {
            throw new RuntimeException("Nepavyko įvykdyti Liquibase migracijų.", e);
        }
    }
}