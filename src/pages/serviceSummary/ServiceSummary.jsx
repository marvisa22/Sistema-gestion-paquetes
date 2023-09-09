import React from 'react';
import './serviceSummary.scss'

const packageRequest = {
  originLocation: 'Ciudad A',
  destinationLocation: 'Ciudad B',
  packageType: 'Articulos Personales',
  packageFragility: 'Normal',
  productValue: '$1000',
  serviceType: 'Estandar',
  packageSecurity: false,
};

const ServiceSummary = () => {
  return (
    <>
      <h2 style={{textAlign:'center', marginTop:'5rem'}}>Resumen del Pedido</h2>
    <div className='container-summary'>
      <table>
        <tbody>
          <tr>
            <td>Ubicación de Origen:</td>
            <td>{packageRequest.originLocation}</td>
          </tr>
          <tr>
            <td>Ubicación de Destino:</td>
            <td>{packageRequest.destinationLocation}</td>
          </tr>
          <tr>
            <td>Tipo de Paquete:</td>
            <td>{packageRequest.packageType}</td>
          </tr>
          <tr>
            <td>Nivel de Fragilidad:</td>
            <td>{packageRequest.packageFragility}</td>
          </tr>
          <tr>
            <td>Valor del Producto:</td>
            <td>{packageRequest.productValue}</td>
          </tr>
          <tr>
            <td>Tipo de Servicio:</td>
            <td>{packageRequest.serviceType}</td>
          </tr>
          <tr>
            <td>Seguridad del Paquete:</td>
            <td>{packageRequest.packageSecurity ? 'Sí' : 'No'}</td>
          </tr>
          <tr>
            <td>Costo de envio:</td>
            <td>$7500</td>
          </tr>
        </tbody>
      </table>
      <img src="https://cdn.pixabay.com/photo/2015/04/03/16/36/bee-705412_1280.png" style={{width:'200px'}} alt="" />
    </div>
    </>
  );
};

export default ServiceSummary;
