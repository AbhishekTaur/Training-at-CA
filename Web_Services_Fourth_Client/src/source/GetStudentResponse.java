
package source;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetStudentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStudentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Stu" type="{http://source/}student" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStudentResponse", propOrder = {
    "stu"
})
public class GetStudentResponse {

    @XmlElement(name = "Stu")
    protected Student stu;

    /**
     * Gets the value of the stu property.
     * 
     * @return
     *     possible object is
     *     {@link Student }
     *     
     */
    public Student getStu() {
        return stu;
    }

    /**
     * Sets the value of the stu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Student }
     *     
     */
    public void setStu(Student value) {
        this.stu = value;
    }

}
