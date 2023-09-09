import * as React from 'react';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Modal from '@mui/material/Modal';
import './modalServiceRequest.scss'


const style = {
    position: 'absolute',
    top: '50%',
    left: '50%',
    transform: 'translate(-50%, -50%)',
    width: 'auto',
    bgcolor: 'background.paper',
    border: '2px solid #000',
    boxShadow: 24,
    p: 4,
};

export default function ModalFormServiceRequest({ selectedAmount }) {
    const [open, setOpen] = React.useState(false);
    const handleOpen = () => setOpen(true);
    const handleClose = () => setOpen(false);

    return (
        <>
            <span onClick={handleOpen} style={{
                textDecoration: 'underline', fontWeight: 'bold'

            }}>Buscar</span>
            <Modal
                open={open}
                onClose={handleClose}
                aria-labelledby="modal-modal-title"
                aria-describedby="modal-modal-description"
            >
                <Box sx={style}>
                    <h3 style={{ textAlign: 'center', marginBottom: '1rem', fontFamily: 'arial, helvetica, sans-serif' }}>Seleccionar Tipo de Paquete</h3>
                    <Typography id="modal-modal-title" variant="h6" component="h2">

                        <div id="miDiv">
                        {/* <p>Seleccionar Tipo de Paquete</p> */}
                            <button data-action="accion1">Articulos Personales</button>
                            <button data-action="accion2">Documentos Importantes</button>
                            <button data-action="accion3">Alimentos y Bebidas</button>
                            <button data-action="accion3">Productps Farmaceuticos</button>
                        </div>







                    </Typography>


                </Box>
            </Modal>
        </>
    );
}