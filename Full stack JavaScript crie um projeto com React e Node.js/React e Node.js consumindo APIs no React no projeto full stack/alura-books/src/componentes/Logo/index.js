import logo from '../../imagens/logo.svg';
import styled from 'styled-components';

const LogoContainer = styled.div`
    display: flex;
    font-size: 30px;
`
const LogoImagem = styled.img`
    margin-right: 10px;
`

function Logo() {
    return (
        <LogoContainer>
            <LogoImagem
                src={logo}
                alt="logo"
            />
            <p>
                <strong>Alura Books</strong>
            </p>
        </LogoContainer>
    );
}

export default Logo;