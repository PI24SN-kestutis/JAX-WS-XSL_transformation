
package lt.viko.eif.kskrebe.client.generated;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lt.viko.eif.kskrebe.client.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Car_QNAME = new QName("http://service.server.kskrebe.eif.viko.lt/", "car");
    private static final QName _GetAllCars_QNAME = new QName("http://service.server.kskrebe.eif.viko.lt/", "getAllCars");
    private static final QName _GetAllCarsResponse_QNAME = new QName("http://service.server.kskrebe.eif.viko.lt/", "getAllCarsResponse");
    private static final QName _GetCarById_QNAME = new QName("http://service.server.kskrebe.eif.viko.lt/", "getCarById");
    private static final QName _GetCarByIdResponse_QNAME = new QName("http://service.server.kskrebe.eif.viko.lt/", "getCarByIdResponse");
    private static final QName _Part_QNAME = new QName("http://service.server.kskrebe.eif.viko.lt/", "part");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.viko.eif.kskrebe.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Car }
     * 
     * @return
     *     the new instance of {@link Car }
     */
    public Car createCar() {
        return new Car();
    }

    /**
     * Create an instance of {@link GetAllCars }
     * 
     * @return
     *     the new instance of {@link GetAllCars }
     */
    public GetAllCars createGetAllCars() {
        return new GetAllCars();
    }

    /**
     * Create an instance of {@link GetAllCarsResponse }
     * 
     * @return
     *     the new instance of {@link GetAllCarsResponse }
     */
    public GetAllCarsResponse createGetAllCarsResponse() {
        return new GetAllCarsResponse();
    }

    /**
     * Create an instance of {@link GetCarById }
     * 
     * @return
     *     the new instance of {@link GetCarById }
     */
    public GetCarById createGetCarById() {
        return new GetCarById();
    }

    /**
     * Create an instance of {@link GetCarByIdResponse }
     * 
     * @return
     *     the new instance of {@link GetCarByIdResponse }
     */
    public GetCarByIdResponse createGetCarByIdResponse() {
        return new GetCarByIdResponse();
    }

    /**
     * Create an instance of {@link Part }
     * 
     * @return
     *     the new instance of {@link Part }
     */
    public Part createPart() {
        return new Part();
    }

    /**
     * Create an instance of {@link Car.Parts }
     * 
     * @return
     *     the new instance of {@link Car.Parts }
     */
    public Car.Parts createCarParts() {
        return new Car.Parts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Car }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Car }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.kskrebe.eif.viko.lt/", name = "car")
    public JAXBElement<Car> createCar(Car value) {
        return new JAXBElement<>(_Car_QNAME, Car.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCars }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCars }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.kskrebe.eif.viko.lt/", name = "getAllCars")
    public JAXBElement<GetAllCars> createGetAllCars(GetAllCars value) {
        return new JAXBElement<>(_GetAllCars_QNAME, GetAllCars.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCarsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCarsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.kskrebe.eif.viko.lt/", name = "getAllCarsResponse")
    public JAXBElement<GetAllCarsResponse> createGetAllCarsResponse(GetAllCarsResponse value) {
        return new JAXBElement<>(_GetAllCarsResponse_QNAME, GetAllCarsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCarById }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.kskrebe.eif.viko.lt/", name = "getCarById")
    public JAXBElement<GetCarById> createGetCarById(GetCarById value) {
        return new JAXBElement<>(_GetCarById_QNAME, GetCarById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCarByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.kskrebe.eif.viko.lt/", name = "getCarByIdResponse")
    public JAXBElement<GetCarByIdResponse> createGetCarByIdResponse(GetCarByIdResponse value) {
        return new JAXBElement<>(_GetCarByIdResponse_QNAME, GetCarByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Part }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Part }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.kskrebe.eif.viko.lt/", name = "part")
    public JAXBElement<Part> createPart(Part value) {
        return new JAXBElement<>(_Part_QNAME, Part.class, null, value);
    }

}
