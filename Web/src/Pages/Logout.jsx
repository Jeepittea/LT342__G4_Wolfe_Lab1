import { useEffect } from "react";
import { useNavigate } from "react-router-dom";

function Logout() {
  const navigate = useNavigate();

  useEffect(() => {
    // Later: clear auth token / session
    navigate("/login");
  }, [navigate]);

  return null;
}

export default Logout;
