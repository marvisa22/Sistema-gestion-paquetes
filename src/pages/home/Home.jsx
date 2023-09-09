import React, { useState } from 'react';
import SearchIcon from '@mui/icons-material/Search';
import { styled, alpha } from '@mui/material/styles';
import InputBase from '@mui/material/InputBase';
import './home.scss';
import ModalFormServiceRequest from '../../components/formServiceRequest/ModalFormServiceRequest';
import { FaBeer } from 'react-icons/fa';
import { FaRegGrinBeam, FaRegMeh, FaRegFrown } from 'react-icons/fa';
import Swal from 'sweetalert2';

const Home = () => {
    const [originLocation, setOriginLocation] = useState(''); // Estado para el campo de origen
    const [destinationLocation, setDestinationLocation] = useState(''); // Estado para el campo de destino
    const [isModalOpen, setIsModalOpen] = useState(false); // Estado para controlar la visibilidad del modal
    const [showMiDiv, setShowMiDiv] = useState(false); // Estado para mostrar miDiv
    const [showHome, setShowHome] = useState(true);
    const [showFragility, setShowFragility] = useState(true); // Estado para mostrar miDiv
    const [showServiceType, setShowServiceType] = useState(true);
    const [packageType, setPackageType] = useState('');
    const [packageFragility, setPackageFragility] = useState('');
    const [productValue, setProductValue] = useState('');
    const [serviceType, setServiceType] = useState('');
    const [packageSecurity, setPackageSecurity] = useState(false);


    const handleOriginLocationChange = (event) => {
        setOriginLocation(event.target.value);
    };

    const handleDestinationLocationChange = (event) => {
        setDestinationLocation(event.target.value);
    };

    const handleConfirmButtonClick = () => {
        // Aquí puedes hacer algo con los valores de originLocation y destinationLocation
        console.log('Ubicación de origen:', originLocation);
        console.log('Ubicación de destino:', destinationLocation);

        // Abre el modal al hacer clic en "Buscar"
        setIsModalOpen(true);

        // Muestra miDiv
        setShowMiDiv(true);
        setShowHome(false);
    };

    const Search = styled('div')(({ theme }) => ({
        position: 'relative',
        borderRadius: theme.shape.borderRadius,
        backgroundColor: alpha(theme.palette.common.white, 0.15),
        '&:hover': {
            backgroundColor: alpha(theme.palette.common.white, 0.25),
        },
        marginRight: theme.spacing(2),
        marginLeft: 0,
        width: '100%',
        [theme.breakpoints.up('sm')]: {
            marginLeft: theme.spacing(3),
            width: 'auto',
        },
    }));

    const SearchIconWrapper = styled('div')(({ theme }) => ({
        padding: theme.spacing(0, 2),
        height: '100%',
        position: 'absolute',
        pointerEvents: 'none',
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
    }));

    const StyledInputBase = styled(InputBase)(({ theme }) => ({
        color: 'inherit',
        '& .MuiInputBase-input': {
            padding: theme.spacing(1, 1, 1, 0),
            paddingLeft: `calc(1em + ${theme.spacing(4)})`,
            transition: theme.transitions.create('width'),
            width: '100%',
            [theme.breakpoints.up('md')]: {
                width: '20ch',
            },
        },
    }));

    const packageRequest = {
        originLocation: originLocation,
        destinationLocation: destinationLocation,
        packageType: packageType,
        packageFragility: packageFragility,
        productValue: productValue,
        serviceType: serviceType,
        packageSecurity: packageSecurity
    }

    console.log(packageRequest);

    const handlePackageTypeClick = (selectedPackageType) => {
        // Aquí puedes guardar la variable packageType según el botón que se hizo clic
        setPackageType(selectedPackageType);

        // También puedes ocultar el div de tipos de paquete si es necesario
        setShowMiDiv(false);
    
    };

    const handleFragilityClick = (selectedFragility) => {
        // Aquí puedes guardar el nivel de fragilidad según el botón que se hizo clic
        setPackageFragility(selectedFragility);

        // También puedes ocultar el div de fragilidad si es necesario
        setShowFragility(false);
    };

    const handleServiceTypeClick = (selectedServiceType) => {
        // Aquí puedes guardar el tipo de servicio según el botón que se hizo clic
        setServiceType(selectedServiceType);

        // También puedes ocultar el div del tipo de servicio si es necesario
        setShowServiceType(false);
    };

    const handleConfirm = () => {
        // Aquí puedes hacer algo con los valores de origen y destino
        console.log('Ubicación de origen:', originLocation);
        console.log('Ubicación de destino:', destinationLocation);
    
        // Abre SweetAlert al hacer clic en "CONFIRMAR ENVÍO"
        Swal.fire({
            title: 'Confirmar Envío',
            text: '¿Estás seguro de confirmar el envío?',
            icon: 'warning',
            showCancelButton: true,
            confirmButtonColor: '#3085d6',
            cancelButtonColor: '#d33',
            confirmButtonText: 'Sí, confirmar',
            cancelButtonText: 'Cancelar',
        }).then((result) => {
            if (result.isConfirmed) {
                // Aquí puedes realizar alguna acción adicional si se confirma el envío
                console.log('Envío confirmado');
    
                // Mostrar notificación de éxito
                Swal.fire({
                    position: 'center',
                    icon: 'success',
                    title: 'El envío ha sido confirmado',
                    showConfirmButton: false,
                    timer: 1500,
                }).then(() => {
                    // Redirige al usuario a ServiceStatus después de la notificación de éxito
                    window.location.replace('/estado-servicio');
                });
            }
        });
    };
    


    return (
        <>

            {showHome && (
                <div className='container__banner'>
                           {/* <p>Recibe tus paquetes en tan solo unos pocos clicks</p> */}
                    <section className='section__search'>
                        <Search>
                            <SearchIconWrapper>
                                <SearchIcon />
                            </SearchIconWrapper>
                            <StyledInputBase
                                placeholder="Ubicación del origen..."
                                inputProps={{ 'aria-label': 'search' }}
                                value={originLocation}
                                onChange={handleOriginLocationChange}
                            />
                        </Search>
                        <Search>
                            <SearchIconWrapper>
                                <SearchIcon />
                            </SearchIconWrapper>
                            <StyledInputBase
                                placeholder="Ubicación de destino..."
                                inputProps={{ 'aria-label': 'search' }}
                                value={destinationLocation}
                                onChange={handleDestinationLocationChange}
                            />
                        </Search>

                 
                    </section>
                   

                    <div>
                        <button className='container__btn' onClick={handleConfirmButtonClick}>Buscar</button>
                    </div>

                    <div>
                        <img src="https://res.cloudinary.com/dwevhpoby/image/upload/v1694296460/removal.ai__d7e12c08-4e44-48d2-8ad1-21053cbb7776-caja-aveja_tw1wpf.png" style={{width:'100%'}} alt="" />
                
                    </div>
                </div>

                
            )}

            <selectType />



            {showMiDiv && (
                <>
                    <h3 className='types__title' >SELECCIONAR TIPO DE PAQUETE</h3>
                    <div id="miDiv" className='container__types'>
                        <button onClick={() => handlePackageTypeClick('Articulos Personales')}>Articulos Personales</button>
                        <button onClick={() => handlePackageTypeClick('Documentos Importantes')}>Documentos Importantes</button>
                        <button onClick={() => handlePackageTypeClick('Alimentos y Bebidas')}>Alimentos y Bebidas</button>
                        <button onClick={() => handlePackageTypeClick('Productos Farmacéuticos')}>Productos Farmacéuticos</button>
                    </div>
                </>
            )}



            {showFragility && (
                <>
                    <h3 className='types__title' >SELECCIONAR NIVEL DE FRAGILIDAD</h3>
                    <div id="miDiv" className='container__fragility'>
                        <button className='btn_face' onClick={() => handleFragilityClick('Normal')}>
                            <FaRegGrinBeam className='btnFace' />
                            <span>Normal </span>
                        </button>
                        <button className='btn_face' onClick={() => handleFragilityClick('Fragil')}>
                            <FaRegMeh />
                            <span>Fragil</span>
                        </button>
                        <button className='btn_face' onClick={() => handleFragilityClick('Muy Fragil')}>
                            <FaRegFrown />
                            <span>Muy Fragil</span>
                        </button>
                    </div>




                </>
            )}



            {showServiceType && (
                <>
                    <h3 className='types__title' >SELECCIONAR TIPO DE SERVICIO</h3>
                    <div id="miDiv" className='container__fragility'>
                        <button className='btn_face' onClick={() => handleServiceTypeClick('Estandar')}>
                            <span>Estandar</span>
                        </button>
                        <button className='btn_face' onClick={() => handleServiceTypeClick('Express')}>
                            <span>Express</span>
                        </button>
                    </div>
                </>
            )}

            <div className='btn-confirm'>
                <button  onClick={handleConfirm}>CONFIRMAR ENVÍO</button>

            </div>






            {/* {isModalOpen && <ModalFormServiceRequest onClick={handleConfirmButtonClick} onClose={() => setIsModalOpen(false)} />} */}
        </>
    );
};

export default Home;
