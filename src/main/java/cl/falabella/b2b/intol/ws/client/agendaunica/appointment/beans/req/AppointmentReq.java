
package cl.falabella.b2b.intol.ws.client.agendaunica.appointment.beans.req;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientService">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Country" type="{http://mdwcorp.falabella.com/LOG/CORP/WLS/schema/WMOS/Appointment/Req/v2017.02}Country_TYPE"/>
 *                   &lt;element name="Commerce" type="{http://mdwcorp.falabella.com/LOG/CORP/WLS/schema/WMOS/Appointment/Req/v2017.02}Commerce_TYPE"/>
 *                   &lt;element name="Channel" type="{http://mdwcorp.falabella.com/LOG/CORP/WLS/schema/WMOS/Appointment/Req/v2017.02}Channel_TYPE"/>
 *                   &lt;element name="StoreId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="Hour" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Source">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ActionType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SequenceNumber" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BatchId" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ReferenceId" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="UserId" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="35"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Password" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="MessageType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CompanyId">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="9"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="MessageLocale" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="MessageTimeZone" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Version" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SendMessage" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CarrierCompany" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Sequence" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Appointment" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AppointmentId" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="75"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AppointmentType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="12"/>
 *                                   &lt;enumeration value="LiveUnload"/>
 *                                   &lt;enumeration value="DropUnload"/>
 *                                   &lt;enumeration value="DropEmpty"/>
 *                                   &lt;enumeration value="LiveLoad"/>
 *                                   &lt;enumeration value="PickupEmpty"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FacilityAliasId">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="16"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AppointmentStatus" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="11"/>
 *                                   &lt;enumeration value="Unscheduled"/>
 *                                   &lt;enumeration value="Requested"/>
 *                                   &lt;enumeration value="Scheduled"/>
 *                                   &lt;enumeration value="Canceled"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="SealNumber" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CarrierCode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ScheduledDateTime" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ActualCheckInDateTime" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CheckOutDateTime" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="LoadUnloadStartDateTime" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="LoadUnloadEndDateTime" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AppointmentPriority" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="12"/>
 *                                   &lt;enumeration value="MostCritical"/>
 *                                   &lt;enumeration value="Critical"/>
 *                                   &lt;enumeration value="High"/>
 *                                   &lt;enumeration value="Normal"/>
 *                                   &lt;enumeration value="Low"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DriverDurationInMin" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ControlNumber" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RequestorName" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RequestorType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ReservedAppointmentId" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TpCompanyId" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AppointmentReasonId" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AppointmentReasonCode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TrailerDurationInMinutes" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;totalDigits value="9"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DriverId" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CancelReasonCode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CommunicationMode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AppointmentComments" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="BusinessPartner" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CancelIndicator" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="LoadPosition" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="4"/>
 *                                   &lt;enumeration value="Nose"/>
 *                                   &lt;enumeration value="Tail"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="BusinessUnit" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="9"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RequestedTime">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="25"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TemplateId" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CancelledAppointmentId" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AppointmentSource" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="LoadConfiguration" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="EquipmentId" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="EquipmentCode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TractorId" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TractorType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Equipment" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DockId" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DoorId" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="32"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ApptObject" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ObjectType" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="8"/>
 *                                             &lt;enumeration value="ASN"/>
 *                                             &lt;enumeration value="Shipment"/>
 *                                             &lt;enumeration value="PO"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ObjectId" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="20"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="StopSequence" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                             &lt;totalDigits value="4"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="PurchaseOrder" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="BookedSize" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="SizeUOM" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="PurchaseOrderId" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AppointmentSlots" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SlotId" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="SlotStartDateTime" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="SlotDuration" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="CapacityUsed" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CustomAttribute" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AttributeName" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="AttributeValue" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientService",
    "header",
    "message"
})
@XmlRootElement(name = "AppointmentReq")
public class AppointmentReq {

    @XmlElement(name = "ClientService", required = true)
    protected AppointmentReq.ClientService clientService;
    @XmlElement(name = "Header", required = true)
    protected AppointmentReq.Header header;
    @XmlElement(name = "Message", required = true)
    protected AppointmentReq.Message message;

    /**
     * Gets the value of the clientService property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentReq.ClientService }
     *     
     */
    public AppointmentReq.ClientService getClientService() {
        return clientService;
    }

    /**
     * Sets the value of the clientService property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentReq.ClientService }
     *     
     */
    public void setClientService(AppointmentReq.ClientService value) {
        this.clientService = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentReq.Header }
     *     
     */
    public AppointmentReq.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentReq.Header }
     *     
     */
    public void setHeader(AppointmentReq.Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentReq.Message }
     *     
     */
    public AppointmentReq.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentReq.Message }
     *     
     */
    public void setMessage(AppointmentReq.Message value) {
        this.message = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Country" type="{http://mdwcorp.falabella.com/LOG/CORP/WLS/schema/WMOS/Appointment/Req/v2017.02}Country_TYPE"/>
     *         &lt;element name="Commerce" type="{http://mdwcorp.falabella.com/LOG/CORP/WLS/schema/WMOS/Appointment/Req/v2017.02}Commerce_TYPE"/>
     *         &lt;element name="Channel" type="{http://mdwcorp.falabella.com/LOG/CORP/WLS/schema/WMOS/Appointment/Req/v2017.02}Channel_TYPE"/>
     *         &lt;element name="StoreId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="Hour" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "country",
        "commerce",
        "channel",
        "storeId",
        "terminalId",
        "date",
        "hour"
    })
    public static class ClientService {

        @XmlElement(name = "Country", required = true)
        protected CountryTYPE country;
        @XmlElement(name = "Commerce", required = true)
        protected CommerceTYPE commerce;
        @XmlElement(name = "Channel", required = true)
        protected ChannelTYPE channel;
        @XmlElement(name = "StoreId")
        protected String storeId;
        @XmlElement(name = "TerminalId")
        protected String terminalId;
        @XmlElement(name = "Date")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlElement(name = "Hour")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar hour;

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link CountryTYPE }
         *     
         */
        public CountryTYPE getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link CountryTYPE }
         *     
         */
        public void setCountry(CountryTYPE value) {
            this.country = value;
        }

        /**
         * Gets the value of the commerce property.
         * 
         * @return
         *     possible object is
         *     {@link CommerceTYPE }
         *     
         */
        public CommerceTYPE getCommerce() {
            return commerce;
        }

        /**
         * Sets the value of the commerce property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommerceTYPE }
         *     
         */
        public void setCommerce(CommerceTYPE value) {
            this.commerce = value;
        }

        /**
         * Gets the value of the channel property.
         * 
         * @return
         *     possible object is
         *     {@link ChannelTYPE }
         *     
         */
        public ChannelTYPE getChannel() {
            return channel;
        }

        /**
         * Sets the value of the channel property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChannelTYPE }
         *     
         */
        public void setChannel(ChannelTYPE value) {
            this.channel = value;
        }

        /**
         * Gets the value of the storeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStoreId() {
            return storeId;
        }

        /**
         * Sets the value of the storeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStoreId(String value) {
            this.storeId = value;
        }

        /**
         * Gets the value of the terminalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTerminalId() {
            return terminalId;
        }

        /**
         * Sets the value of the terminalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTerminalId(String value) {
            this.terminalId = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the hour property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getHour() {
            return hour;
        }

        /**
         * Sets the value of the hour property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHour(XMLGregorianCalendar value) {
            this.hour = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Source">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ActionType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SequenceNumber" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BatchId" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ReferenceId" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="UserId" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="35"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Password" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="MessageType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="40"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CompanyId">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="9"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="MessageLocale" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="MessageTimeZone" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Version" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SendMessage" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CarrierCompany" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Sequence" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "source",
        "actionType",
        "sequenceNumber",
        "batchId",
        "referenceId",
        "userId",
        "password",
        "messageType",
        "companyId",
        "messageLocale",
        "messageTimeZone",
        "version",
        "sendMessage",
        "carrierCompany",
        "sequence"
    })
    public static class Header {

        @XmlElement(name = "Source", required = true)
        protected String source;
        @XmlElement(name = "ActionType", required = true)
        protected String actionType;
        @XmlElement(name = "SequenceNumber")
        protected String sequenceNumber;
        @XmlElement(name = "BatchId")
        protected String batchId;
        @XmlElement(name = "ReferenceId")
        protected String referenceId;
        @XmlElement(name = "UserId")
        protected String userId;
        @XmlElement(name = "Password")
        protected String password;
        @XmlElement(name = "MessageType", required = true)
        protected String messageType;
        @XmlElement(name = "CompanyId", required = true)
        protected String companyId;
        @XmlElement(name = "MessageLocale")
        protected String messageLocale;
        @XmlElement(name = "MessageTimeZone")
        protected String messageTimeZone;
        @XmlElement(name = "Version")
        protected String version;
        @XmlElement(name = "SendMessage")
        protected String sendMessage;
        @XmlElement(name = "CarrierCompany")
        protected String carrierCompany;
        @XmlElement(name = "Sequence")
        protected String sequence;

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Gets the value of the actionType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionType() {
            return actionType;
        }

        /**
         * Sets the value of the actionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionType(String value) {
            this.actionType = value;
        }

        /**
         * Gets the value of the sequenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSequenceNumber() {
            return sequenceNumber;
        }

        /**
         * Sets the value of the sequenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSequenceNumber(String value) {
            this.sequenceNumber = value;
        }

        /**
         * Gets the value of the batchId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBatchId() {
            return batchId;
        }

        /**
         * Sets the value of the batchId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBatchId(String value) {
            this.batchId = value;
        }

        /**
         * Gets the value of the referenceId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceId() {
            return referenceId;
        }

        /**
         * Sets the value of the referenceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceId(String value) {
            this.referenceId = value;
        }

        /**
         * Gets the value of the userId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserId() {
            return userId;
        }

        /**
         * Sets the value of the userId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserId(String value) {
            this.userId = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Gets the value of the messageType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessageType() {
            return messageType;
        }

        /**
         * Sets the value of the messageType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessageType(String value) {
            this.messageType = value;
        }

        /**
         * Gets the value of the companyId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyId() {
            return companyId;
        }

        /**
         * Sets the value of the companyId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyId(String value) {
            this.companyId = value;
        }

        /**
         * Gets the value of the messageLocale property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessageLocale() {
            return messageLocale;
        }

        /**
         * Sets the value of the messageLocale property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessageLocale(String value) {
            this.messageLocale = value;
        }

        /**
         * Gets the value of the messageTimeZone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessageTimeZone() {
            return messageTimeZone;
        }

        /**
         * Sets the value of the messageTimeZone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessageTimeZone(String value) {
            this.messageTimeZone = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * Gets the value of the sendMessage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSendMessage() {
            return sendMessage;
        }

        /**
         * Sets the value of the sendMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSendMessage(String value) {
            this.sendMessage = value;
        }

        /**
         * Gets the value of the carrierCompany property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCarrierCompany() {
            return carrierCompany;
        }

        /**
         * Sets the value of the carrierCompany property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCarrierCompany(String value) {
            this.carrierCompany = value;
        }

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSequence(String value) {
            this.sequence = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Appointment" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AppointmentId" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="75"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AppointmentType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="12"/>
     *                         &lt;enumeration value="LiveUnload"/>
     *                         &lt;enumeration value="DropUnload"/>
     *                         &lt;enumeration value="DropEmpty"/>
     *                         &lt;enumeration value="LiveLoad"/>
     *                         &lt;enumeration value="PickupEmpty"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FacilityAliasId">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="16"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AppointmentStatus" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="11"/>
     *                         &lt;enumeration value="Unscheduled"/>
     *                         &lt;enumeration value="Requested"/>
     *                         &lt;enumeration value="Scheduled"/>
     *                         &lt;enumeration value="Canceled"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SealNumber" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CarrierCode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ScheduledDateTime" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ActualCheckInDateTime" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CheckOutDateTime" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="LoadUnloadStartDateTime" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="LoadUnloadEndDateTime" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AppointmentPriority" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="12"/>
     *                         &lt;enumeration value="MostCritical"/>
     *                         &lt;enumeration value="Critical"/>
     *                         &lt;enumeration value="High"/>
     *                         &lt;enumeration value="Normal"/>
     *                         &lt;enumeration value="Low"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DriverDurationInMin" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ControlNumber" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="50"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RequestorName" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="50"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RequestorType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ReservedAppointmentId" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TpCompanyId" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AppointmentReasonId" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AppointmentReasonCode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TrailerDurationInMinutes" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;totalDigits value="9"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DriverId" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CancelReasonCode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CommunicationMode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AppointmentComments" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="255"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="BusinessPartner" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CancelIndicator" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="LoadPosition" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="4"/>
     *                         &lt;enumeration value="Nose"/>
     *                         &lt;enumeration value="Tail"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="BusinessUnit" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="9"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RequestedTime">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="25"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TemplateId" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CancelledAppointmentId" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AppointmentSource" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="LoadConfiguration" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="EquipmentId" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="EquipmentCode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TractorId" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TractorType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Equipment" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DockId" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DoorId" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="32"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ApptObject" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ObjectType" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="8"/>
     *                                   &lt;enumeration value="ASN"/>
     *                                   &lt;enumeration value="Shipment"/>
     *                                   &lt;enumeration value="PO"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ObjectId" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="20"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="StopSequence" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                   &lt;totalDigits value="4"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="PurchaseOrder" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="BookedSize" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="SizeUOM" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="PurchaseOrderId" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AppointmentSlots" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SlotId" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="SlotStartDateTime" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="SlotDuration" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="CapacityUsed" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CustomAttribute" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AttributeName" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="AttributeValue" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "appointment"
    })
    public static class Message {

        @XmlElement(name = "Appointment", required = true)
        protected List<AppointmentReq.Message.Appointment> appointment;

        /**
         * Gets the value of the appointment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the appointment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAppointment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AppointmentReq.Message.Appointment }
         * 
         * 
         */
        public List<AppointmentReq.Message.Appointment> getAppointment() {
            if (appointment == null) {
                appointment = new ArrayList<AppointmentReq.Message.Appointment>();
            }
            return this.appointment;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AppointmentId" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="75"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AppointmentType">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="12"/>
         *               &lt;enumeration value="LiveUnload"/>
         *               &lt;enumeration value="DropUnload"/>
         *               &lt;enumeration value="DropEmpty"/>
         *               &lt;enumeration value="LiveLoad"/>
         *               &lt;enumeration value="PickupEmpty"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FacilityAliasId">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="16"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AppointmentStatus" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="11"/>
         *               &lt;enumeration value="Unscheduled"/>
         *               &lt;enumeration value="Requested"/>
         *               &lt;enumeration value="Scheduled"/>
         *               &lt;enumeration value="Canceled"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SealNumber" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CarrierCode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ScheduledDateTime" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ActualCheckInDateTime" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CheckOutDateTime" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="LoadUnloadStartDateTime" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="LoadUnloadEndDateTime" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AppointmentPriority" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="12"/>
         *               &lt;enumeration value="MostCritical"/>
         *               &lt;enumeration value="Critical"/>
         *               &lt;enumeration value="High"/>
         *               &lt;enumeration value="Normal"/>
         *               &lt;enumeration value="Low"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DriverDurationInMin" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ControlNumber" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RequestorName" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RequestorType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ReservedAppointmentId" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TpCompanyId" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AppointmentReasonId" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AppointmentReasonCode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TrailerDurationInMinutes" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;totalDigits value="9"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DriverId" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CancelReasonCode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CommunicationMode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AppointmentComments" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="255"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="BusinessPartner" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CancelIndicator" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="LoadPosition" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="4"/>
         *               &lt;enumeration value="Nose"/>
         *               &lt;enumeration value="Tail"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="BusinessUnit" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="9"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RequestedTime">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="25"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TemplateId" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CancelledAppointmentId" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AppointmentSource" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="LoadConfiguration" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="EquipmentId" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="EquipmentCode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TractorId" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TractorType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Equipment" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DockId" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DoorId" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="32"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ApptObject" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ObjectType" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="8"/>
         *                         &lt;enumeration value="ASN"/>
         *                         &lt;enumeration value="Shipment"/>
         *                         &lt;enumeration value="PO"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="ObjectId" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="20"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="StopSequence" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                         &lt;totalDigits value="4"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="PurchaseOrder" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="BookedSize" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="SizeUOM" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="PurchaseOrderId" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AppointmentSlots" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SlotId" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="SlotStartDateTime" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="SlotDuration" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="CapacityUsed" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CustomAttribute" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AttributeName" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="AttributeValue" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "appointmentId",
            "appointmentType",
            "facilityAliasId",
            "appointmentStatus",
            "sealNumber",
            "carrierCode",
            "scheduledDateTime",
            "actualCheckInDateTime",
            "checkOutDateTime",
            "loadUnloadStartDateTime",
            "loadUnloadEndDateTime",
            "appointmentPriority",
            "driverDurationInMin",
            "controlNumber",
            "requestorName",
            "requestorType",
            "reservedAppointmentId",
            "tpCompanyId",
            "appointmentReasonId",
            "appointmentReasonCode",
            "trailerDurationInMinutes",
            "driverId",
            "cancelReasonCode",
            "communicationMode",
            "appointmentComments",
            "businessPartner",
            "cancelIndicator",
            "loadPosition",
            "businessUnit",
            "requestedTime",
            "templateId",
            "cancelledAppointmentId",
            "appointmentSource",
            "loadConfiguration",
            "equipmentId",
            "equipmentCode",
            "tractorId",
            "tractorType",
            "equipment",
            "dockId",
            "doorId",
            "apptObject",
            "appointmentSlots",
            "customAttribute"
        })
        public static class Appointment {

            @XmlElement(name = "AppointmentId")
            protected String appointmentId;
            @XmlElement(name = "AppointmentType", required = true)
            protected String appointmentType;
            @XmlElement(name = "FacilityAliasId", required = true)
            protected String facilityAliasId;
            @XmlElement(name = "AppointmentStatus")
            protected String appointmentStatus;
            @XmlElement(name = "SealNumber")
            protected String sealNumber;
            @XmlElement(name = "CarrierCode")
            protected String carrierCode;
            @XmlElement(name = "ScheduledDateTime")
            protected String scheduledDateTime;
            @XmlElement(name = "ActualCheckInDateTime")
            protected String actualCheckInDateTime;
            @XmlElement(name = "CheckOutDateTime")
            protected String checkOutDateTime;
            @XmlElement(name = "LoadUnloadStartDateTime")
            protected String loadUnloadStartDateTime;
            @XmlElement(name = "LoadUnloadEndDateTime")
            protected String loadUnloadEndDateTime;
            @XmlElement(name = "AppointmentPriority")
            protected String appointmentPriority;
            @XmlElement(name = "DriverDurationInMin")
            protected String driverDurationInMin;
            @XmlElement(name = "ControlNumber")
            protected String controlNumber;
            @XmlElement(name = "RequestorName")
            protected String requestorName;
            @XmlElement(name = "RequestorType")
            protected String requestorType;
            @XmlElement(name = "ReservedAppointmentId")
            protected String reservedAppointmentId;
            @XmlElement(name = "TpCompanyId")
            protected String tpCompanyId;
            @XmlElement(name = "AppointmentReasonId")
            protected String appointmentReasonId;
            @XmlElement(name = "AppointmentReasonCode")
            protected String appointmentReasonCode;
            @XmlElement(name = "TrailerDurationInMinutes")
            protected BigInteger trailerDurationInMinutes;
            @XmlElement(name = "DriverId")
            protected String driverId;
            @XmlElement(name = "CancelReasonCode")
            protected String cancelReasonCode;
            @XmlElement(name = "CommunicationMode")
            protected String communicationMode;
            @XmlElement(name = "AppointmentComments")
            protected String appointmentComments;
            @XmlElement(name = "BusinessPartner")
            protected String businessPartner;
            @XmlElement(name = "CancelIndicator")
            protected String cancelIndicator;
            @XmlElement(name = "LoadPosition")
            protected String loadPosition;
            @XmlElement(name = "BusinessUnit")
            protected String businessUnit;
            @XmlElement(name = "RequestedTime", required = true)
            protected String requestedTime;
            @XmlElement(name = "TemplateId")
            protected String templateId;
            @XmlElement(name = "CancelledAppointmentId")
            protected String cancelledAppointmentId;
            @XmlElement(name = "AppointmentSource")
            protected String appointmentSource;
            @XmlElement(name = "LoadConfiguration")
            protected String loadConfiguration;
            @XmlElement(name = "EquipmentId")
            protected String equipmentId;
            @XmlElement(name = "EquipmentCode")
            protected String equipmentCode;
            @XmlElement(name = "TractorId")
            protected String tractorId;
            @XmlElement(name = "TractorType")
            protected String tractorType;
            @XmlElement(name = "Equipment")
            protected String equipment;
            @XmlElement(name = "DockId")
            protected String dockId;
            @XmlElement(name = "DoorId")
            protected String doorId;
            @XmlElement(name = "ApptObject", required = true)
            protected List<AppointmentReq.Message.Appointment.ApptObject> apptObject;
            @XmlElement(name = "AppointmentSlots", required = true)
            protected List<AppointmentReq.Message.Appointment.AppointmentSlots> appointmentSlots;
            @XmlElement(name = "CustomAttribute")
            protected List<AppointmentReq.Message.Appointment.CustomAttribute> customAttribute;

            /**
             * Gets the value of the appointmentId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAppointmentId() {
                return appointmentId;
            }

            /**
             * Sets the value of the appointmentId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAppointmentId(String value) {
                this.appointmentId = value;
            }

            /**
             * Gets the value of the appointmentType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAppointmentType() {
                return appointmentType;
            }

            /**
             * Sets the value of the appointmentType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAppointmentType(String value) {
                this.appointmentType = value;
            }

            /**
             * Gets the value of the facilityAliasId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFacilityAliasId() {
                return facilityAliasId;
            }

            /**
             * Sets the value of the facilityAliasId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFacilityAliasId(String value) {
                this.facilityAliasId = value;
            }

            /**
             * Gets the value of the appointmentStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAppointmentStatus() {
                return appointmentStatus;
            }

            /**
             * Sets the value of the appointmentStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAppointmentStatus(String value) {
                this.appointmentStatus = value;
            }

            /**
             * Gets the value of the sealNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSealNumber() {
                return sealNumber;
            }

            /**
             * Sets the value of the sealNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSealNumber(String value) {
                this.sealNumber = value;
            }

            /**
             * Gets the value of the carrierCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCarrierCode() {
                return carrierCode;
            }

            /**
             * Sets the value of the carrierCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCarrierCode(String value) {
                this.carrierCode = value;
            }

            /**
             * Gets the value of the scheduledDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScheduledDateTime() {
                return scheduledDateTime;
            }

            /**
             * Sets the value of the scheduledDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScheduledDateTime(String value) {
                this.scheduledDateTime = value;
            }

            /**
             * Gets the value of the actualCheckInDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActualCheckInDateTime() {
                return actualCheckInDateTime;
            }

            /**
             * Sets the value of the actualCheckInDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActualCheckInDateTime(String value) {
                this.actualCheckInDateTime = value;
            }

            /**
             * Gets the value of the checkOutDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckOutDateTime() {
                return checkOutDateTime;
            }

            /**
             * Sets the value of the checkOutDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckOutDateTime(String value) {
                this.checkOutDateTime = value;
            }

            /**
             * Gets the value of the loadUnloadStartDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoadUnloadStartDateTime() {
                return loadUnloadStartDateTime;
            }

            /**
             * Sets the value of the loadUnloadStartDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoadUnloadStartDateTime(String value) {
                this.loadUnloadStartDateTime = value;
            }

            /**
             * Gets the value of the loadUnloadEndDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoadUnloadEndDateTime() {
                return loadUnloadEndDateTime;
            }

            /**
             * Sets the value of the loadUnloadEndDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoadUnloadEndDateTime(String value) {
                this.loadUnloadEndDateTime = value;
            }

            /**
             * Gets the value of the appointmentPriority property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAppointmentPriority() {
                return appointmentPriority;
            }

            /**
             * Sets the value of the appointmentPriority property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAppointmentPriority(String value) {
                this.appointmentPriority = value;
            }

            /**
             * Gets the value of the driverDurationInMin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDriverDurationInMin() {
                return driverDurationInMin;
            }

            /**
             * Sets the value of the driverDurationInMin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDriverDurationInMin(String value) {
                this.driverDurationInMin = value;
            }

            /**
             * Gets the value of the controlNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getControlNumber() {
                return controlNumber;
            }

            /**
             * Sets the value of the controlNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setControlNumber(String value) {
                this.controlNumber = value;
            }

            /**
             * Gets the value of the requestorName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestorName() {
                return requestorName;
            }

            /**
             * Sets the value of the requestorName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestorName(String value) {
                this.requestorName = value;
            }

            /**
             * Gets the value of the requestorType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestorType() {
                return requestorType;
            }

            /**
             * Sets the value of the requestorType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestorType(String value) {
                this.requestorType = value;
            }

            /**
             * Gets the value of the reservedAppointmentId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReservedAppointmentId() {
                return reservedAppointmentId;
            }

            /**
             * Sets the value of the reservedAppointmentId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReservedAppointmentId(String value) {
                this.reservedAppointmentId = value;
            }

            /**
             * Gets the value of the tpCompanyId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpCompanyId() {
                return tpCompanyId;
            }

            /**
             * Sets the value of the tpCompanyId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpCompanyId(String value) {
                this.tpCompanyId = value;
            }

            /**
             * Gets the value of the appointmentReasonId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAppointmentReasonId() {
                return appointmentReasonId;
            }

            /**
             * Sets the value of the appointmentReasonId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAppointmentReasonId(String value) {
                this.appointmentReasonId = value;
            }

            /**
             * Gets the value of the appointmentReasonCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAppointmentReasonCode() {
                return appointmentReasonCode;
            }

            /**
             * Sets the value of the appointmentReasonCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAppointmentReasonCode(String value) {
                this.appointmentReasonCode = value;
            }

            /**
             * Gets the value of the trailerDurationInMinutes property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTrailerDurationInMinutes() {
                return trailerDurationInMinutes;
            }

            /**
             * Sets the value of the trailerDurationInMinutes property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTrailerDurationInMinutes(BigInteger value) {
                this.trailerDurationInMinutes = value;
            }

            /**
             * Gets the value of the driverId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDriverId() {
                return driverId;
            }

            /**
             * Sets the value of the driverId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDriverId(String value) {
                this.driverId = value;
            }

            /**
             * Gets the value of the cancelReasonCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCancelReasonCode() {
                return cancelReasonCode;
            }

            /**
             * Sets the value of the cancelReasonCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCancelReasonCode(String value) {
                this.cancelReasonCode = value;
            }

            /**
             * Gets the value of the communicationMode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommunicationMode() {
                return communicationMode;
            }

            /**
             * Sets the value of the communicationMode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommunicationMode(String value) {
                this.communicationMode = value;
            }

            /**
             * Gets the value of the appointmentComments property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAppointmentComments() {
                return appointmentComments;
            }

            /**
             * Sets the value of the appointmentComments property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAppointmentComments(String value) {
                this.appointmentComments = value;
            }

            /**
             * Gets the value of the businessPartner property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusinessPartner() {
                return businessPartner;
            }

            /**
             * Sets the value of the businessPartner property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusinessPartner(String value) {
                this.businessPartner = value;
            }

            /**
             * Gets the value of the cancelIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCancelIndicator() {
                return cancelIndicator;
            }

            /**
             * Sets the value of the cancelIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCancelIndicator(String value) {
                this.cancelIndicator = value;
            }

            /**
             * Gets the value of the loadPosition property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoadPosition() {
                return loadPosition;
            }

            /**
             * Sets the value of the loadPosition property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoadPosition(String value) {
                this.loadPosition = value;
            }

            /**
             * Gets the value of the businessUnit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusinessUnit() {
                return businessUnit;
            }

            /**
             * Sets the value of the businessUnit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusinessUnit(String value) {
                this.businessUnit = value;
            }

            /**
             * Gets the value of the requestedTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestedTime() {
                return requestedTime;
            }

            /**
             * Sets the value of the requestedTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestedTime(String value) {
                this.requestedTime = value;
            }

            /**
             * Gets the value of the templateId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTemplateId() {
                return templateId;
            }

            /**
             * Sets the value of the templateId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTemplateId(String value) {
                this.templateId = value;
            }

            /**
             * Gets the value of the cancelledAppointmentId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCancelledAppointmentId() {
                return cancelledAppointmentId;
            }

            /**
             * Sets the value of the cancelledAppointmentId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCancelledAppointmentId(String value) {
                this.cancelledAppointmentId = value;
            }

            /**
             * Gets the value of the appointmentSource property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAppointmentSource() {
                return appointmentSource;
            }

            /**
             * Sets the value of the appointmentSource property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAppointmentSource(String value) {
                this.appointmentSource = value;
            }

            /**
             * Gets the value of the loadConfiguration property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoadConfiguration() {
                return loadConfiguration;
            }

            /**
             * Sets the value of the loadConfiguration property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoadConfiguration(String value) {
                this.loadConfiguration = value;
            }

            /**
             * Gets the value of the equipmentId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEquipmentId() {
                return equipmentId;
            }

            /**
             * Sets the value of the equipmentId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEquipmentId(String value) {
                this.equipmentId = value;
            }

            /**
             * Gets the value of the equipmentCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEquipmentCode() {
                return equipmentCode;
            }

            /**
             * Sets the value of the equipmentCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEquipmentCode(String value) {
                this.equipmentCode = value;
            }

            /**
             * Gets the value of the tractorId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTractorId() {
                return tractorId;
            }

            /**
             * Sets the value of the tractorId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTractorId(String value) {
                this.tractorId = value;
            }

            /**
             * Gets the value of the tractorType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTractorType() {
                return tractorType;
            }

            /**
             * Sets the value of the tractorType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTractorType(String value) {
                this.tractorType = value;
            }

            /**
             * Gets the value of the equipment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEquipment() {
                return equipment;
            }

            /**
             * Sets the value of the equipment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEquipment(String value) {
                this.equipment = value;
            }

            /**
             * Gets the value of the dockId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDockId() {
                return dockId;
            }

            /**
             * Sets the value of the dockId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDockId(String value) {
                this.dockId = value;
            }

            /**
             * Gets the value of the doorId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDoorId() {
                return doorId;
            }

            /**
             * Sets the value of the doorId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDoorId(String value) {
                this.doorId = value;
            }

            /**
             * Gets the value of the apptObject property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the apptObject property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getApptObject().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AppointmentReq.Message.Appointment.ApptObject }
             * 
             * 
             */
            public List<AppointmentReq.Message.Appointment.ApptObject> getApptObject() {
                if (apptObject == null) {
                    apptObject = new ArrayList<AppointmentReq.Message.Appointment.ApptObject>();
                }
                return this.apptObject;
            }

            /**
             * Gets the value of the appointmentSlots property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the appointmentSlots property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAppointmentSlots().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AppointmentReq.Message.Appointment.AppointmentSlots }
             * 
             * 
             */
            public List<AppointmentReq.Message.Appointment.AppointmentSlots> getAppointmentSlots() {
                if (appointmentSlots == null) {
                    appointmentSlots = new ArrayList<AppointmentReq.Message.Appointment.AppointmentSlots>();
                }
                return this.appointmentSlots;
            }

            /**
             * Gets the value of the customAttribute property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the customAttribute property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCustomAttribute().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AppointmentReq.Message.Appointment.CustomAttribute }
             * 
             * 
             */
            public List<AppointmentReq.Message.Appointment.CustomAttribute> getCustomAttribute() {
                if (customAttribute == null) {
                    customAttribute = new ArrayList<AppointmentReq.Message.Appointment.CustomAttribute>();
                }
                return this.customAttribute;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="SlotId" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="SlotStartDateTime" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="SlotDuration" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="CapacityUsed" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "slotId",
                "slotStartDateTime",
                "slotDuration",
                "capacityUsed"
            })
            public static class AppointmentSlots {

                @XmlElement(name = "SlotId")
                protected String slotId;
                @XmlElement(name = "SlotStartDateTime")
                protected String slotStartDateTime;
                @XmlElement(name = "SlotDuration")
                protected BigInteger slotDuration;
                @XmlElement(name = "CapacityUsed")
                protected BigInteger capacityUsed;

                /**
                 * Gets the value of the slotId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSlotId() {
                    return slotId;
                }

                /**
                 * Sets the value of the slotId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSlotId(String value) {
                    this.slotId = value;
                }

                /**
                 * Gets the value of the slotStartDateTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSlotStartDateTime() {
                    return slotStartDateTime;
                }

                /**
                 * Sets the value of the slotStartDateTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSlotStartDateTime(String value) {
                    this.slotStartDateTime = value;
                }

                /**
                 * Gets the value of the slotDuration property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSlotDuration() {
                    return slotDuration;
                }

                /**
                 * Sets the value of the slotDuration property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSlotDuration(BigInteger value) {
                    this.slotDuration = value;
                }

                /**
                 * Gets the value of the capacityUsed property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCapacityUsed() {
                    return capacityUsed;
                }

                /**
                 * Sets the value of the capacityUsed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCapacityUsed(BigInteger value) {
                    this.capacityUsed = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ObjectType" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="8"/>
             *               &lt;enumeration value="ASN"/>
             *               &lt;enumeration value="Shipment"/>
             *               &lt;enumeration value="PO"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="ObjectId" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="20"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="StopSequence" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *               &lt;totalDigits value="4"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="PurchaseOrder" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="BookedSize" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="SizeUOM" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="PurchaseOrderId" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "objectType",
                "objectId",
                "stopSequence",
                "purchaseOrder"
            })
            public static class ApptObject {

                @XmlElement(name = "ObjectType")
                protected String objectType;
                @XmlElement(name = "ObjectId")
                protected String objectId;
                @XmlElement(name = "StopSequence")
                protected BigInteger stopSequence;
                @XmlElement(name = "PurchaseOrder", required = true)
                protected List<AppointmentReq.Message.Appointment.ApptObject.PurchaseOrder> purchaseOrder;

                /**
                 * Gets the value of the objectType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getObjectType() {
                    return objectType;
                }

                /**
                 * Sets the value of the objectType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setObjectType(String value) {
                    this.objectType = value;
                }

                /**
                 * Gets the value of the objectId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getObjectId() {
                    return objectId;
                }

                /**
                 * Sets the value of the objectId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setObjectId(String value) {
                    this.objectId = value;
                }

                /**
                 * Gets the value of the stopSequence property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getStopSequence() {
                    return stopSequence;
                }

                /**
                 * Sets the value of the stopSequence property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setStopSequence(BigInteger value) {
                    this.stopSequence = value;
                }

                /**
                 * Gets the value of the purchaseOrder property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the purchaseOrder property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPurchaseOrder().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AppointmentReq.Message.Appointment.ApptObject.PurchaseOrder }
                 * 
                 * 
                 */
                public List<AppointmentReq.Message.Appointment.ApptObject.PurchaseOrder> getPurchaseOrder() {
                    if (purchaseOrder == null) {
                        purchaseOrder = new ArrayList<AppointmentReq.Message.Appointment.ApptObject.PurchaseOrder>();
                    }
                    return this.purchaseOrder;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="BookedSize" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="SizeUOM" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="PurchaseOrderId" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "bookedSize",
                    "sizeUOM",
                    "purchaseOrderId"
                })
                public static class PurchaseOrder {

                    @XmlElement(name = "BookedSize")
                    protected BigInteger bookedSize;
                    @XmlElement(name = "SizeUOM")
                    protected String sizeUOM;
                    @XmlElement(name = "PurchaseOrderId")
                    protected String purchaseOrderId;

                    /**
                     * Gets the value of the bookedSize property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getBookedSize() {
                        return bookedSize;
                    }

                    /**
                     * Sets the value of the bookedSize property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setBookedSize(BigInteger value) {
                        this.bookedSize = value;
                    }

                    /**
                     * Gets the value of the sizeUOM property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSizeUOM() {
                        return sizeUOM;
                    }

                    /**
                     * Sets the value of the sizeUOM property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSizeUOM(String value) {
                        this.sizeUOM = value;
                    }

                    /**
                     * Gets the value of the purchaseOrderId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPurchaseOrderId() {
                        return purchaseOrderId;
                    }

                    /**
                     * Sets the value of the purchaseOrderId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPurchaseOrderId(String value) {
                        this.purchaseOrderId = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="AttributeName" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="AttributeValue" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "attributeName",
                "attributeValue"
            })
            public static class CustomAttribute {

                @XmlElement(name = "AttributeName")
                protected String attributeName;
                @XmlElement(name = "AttributeValue")
                protected String attributeValue;

                /**
                 * Gets the value of the attributeName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAttributeName() {
                    return attributeName;
                }

                /**
                 * Sets the value of the attributeName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAttributeName(String value) {
                    this.attributeName = value;
                }

                /**
                 * Gets the value of the attributeValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAttributeValue() {
                    return attributeValue;
                }

                /**
                 * Sets the value of the attributeValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAttributeValue(String value) {
                    this.attributeValue = value;
                }

            }

        }

    }

}
