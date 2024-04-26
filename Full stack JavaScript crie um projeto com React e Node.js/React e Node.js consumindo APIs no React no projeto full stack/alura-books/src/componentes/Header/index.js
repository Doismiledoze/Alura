import Logo from '../Logo';
import OpcoesHeader from '../OpoesHeader';
import IconesHeader from '../IconesHeader';
import styled from 'styled-components';

const HeaderConainer = styled.header`
    background-color: #FFF;
    display: flex;
    justify-content: center;
`;

function Header() {
    return (
        <HeaderConainer>
            <Logo />
            <OpcoesHeader />
            <IconesHeader />
        </HeaderConainer>
    );
}

export default Header;