import * as React from 'react';
import Box from '@mui/material/Box';
import Stepper from '@mui/material/Stepper';
import Step from '@mui/material/Step';
import StepLabel from '@mui/material/StepLabel';
import './serviceStatus.scss'

const steps = [
  'Buscando Repartidor',
  'Repartidor Asignado',
  'Envío a destino',
  'Envío COmpletado',
];
const ServiceStatus = ({stepStatus}) => {
  return (
    <Box sx={{ width: '100%' }}>
        <div className='container-step'>

       
      <Stepper activeStep={stepStatus} alternativeLabel>
        {steps.map((label) => (
          <Step key={label}>
            <StepLabel>{label}</StepLabel>
          </Step>
        ))}
      </Stepper>
      </div>
    </Box>
  );
}

export default ServiceStatus