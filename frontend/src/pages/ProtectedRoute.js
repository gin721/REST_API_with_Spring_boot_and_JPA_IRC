import { Navigate } from "react-router-dom";

const ProtectedRouted = ({ children, user }) => {
    if(!user){
        return <Navigate to="/"/>
    }
    return children;
}

export default ProtectedRouted;