package io.PLDNaturalesSimulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.PLDNaturalesSimulacion.client.model.Error;
import io.PLDNaturalesSimulacion.client.model.Persona;
import io.PLDNaturalesSimulacion.client.model.Respuesta;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Respuesta {
	  @SerializedName("folio")
	  private String folio = null;
	  @SerializedName("numConsulta")
	  private BigDecimal numConsulta = null;
	  @SerializedName("personas")
	  private List<Persona> personas = null;
	  @SerializedName("errores")
	  private List<Error> errores = null;
	  public Respuesta folio(String folio) {
	    this.folio = folio;
	    return this;
	  }
	   
	  @ApiModelProperty(example = "123456789", value = "Es el identificador de la consulta realizada por parte del cliente. Este folio se regresa de manera integra en el elemento respuesta.")
	  public String getFolio() {
	    return folio;
	  }
	  public void setFolio(String folio) {
	    this.folio = folio;
	  }
	  public Respuesta numConsulta(BigDecimal numConsulta) {
	    this.numConsulta = numConsulta;
	    return this;
	  }
	   
	  @ApiModelProperty(example = "123.0", value = "Número de consulta")
	  public BigDecimal getNumConsulta() {
	    return numConsulta;
	  }
	  public void setNumConsulta(BigDecimal numConsulta) {
	    this.numConsulta = numConsulta;
	  }
	  public Respuesta personas(List<Persona> personas) {
	    this.personas = personas;
	    return this;
	  }
	  public Respuesta addPersonasItem(Persona personasItem) {
	    if (this.personas == null) {
	      this.personas = new ArrayList<Persona>();
	    }
	    this.personas.add(personasItem);
	    return this;
	  }
	   
	  @ApiModelProperty(value = "")
	  public List<Persona> getPersonas() {
	    return personas;
	  }
	  public void setPersonas(List<Persona> personas) {
	    this.personas = personas;
	  }
	  public Respuesta errores(List<Error> errores) {
	    this.errores = errores;
	    return this;
	  }
	  public Respuesta addErroresItem(Error erroresItem) {
	    if (this.errores == null) {
	      this.errores = new ArrayList<Error>();
	    }
	    this.errores.add(erroresItem);
	    return this;
	  }
	   
	  @ApiModelProperty(value = "")
	  public List<Error> getErrores() {
	    return errores;
	  }
	  public void setErrores(List<Error> errores) {
	    this.errores = errores;
	  }
	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    Respuesta respuesta = (Respuesta) o;
	    return Objects.equals(this.folio, respuesta.folio) &&
	        Objects.equals(this.numConsulta, respuesta.numConsulta) &&
	        Objects.equals(this.personas, respuesta.personas) &&
	        Objects.equals(this.errores, respuesta.errores);
	  }
	  @Override
	  public int hashCode() {
	    return Objects.hash(folio, numConsulta, personas, errores);
	  }
	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Respuesta {\n");
	    
	    sb.append("    folio: ").append(toIndentedString(folio)).append("\n");
	    sb.append("    numConsulta: ").append(toIndentedString(numConsulta)).append("\n");
	    sb.append("    personas: ").append(toIndentedString(personas)).append("\n");
	    sb.append("    errores: ").append(toIndentedString(errores)).append("\n");
	    sb.append("}");
	    return sb.toString();
	  }
	  
	  private String toIndentedString(java.lang.Object o) {
	    if (o == null) {
	      return "null";
	    }
	    return o.toString().replace("\n", "\n    ");
	  }
	}
