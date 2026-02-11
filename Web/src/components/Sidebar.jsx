import { Link } from "react-router-dom";

export default function Sidebar() {
  return (
    <div style={{ width: "200px", padding: "20px", borderRight: "1px solid #ddd" }}>
      <h3>Mini App</h3>
      <ul style={{ listStyle: "none", padding: 0 }}>
        <li><Link to="/dashboard">Dashboard</Link></li>
        <li><Link to="/profile">Profile</Link></li>
        <li><Link to="/login">Logout</Link></li>
      </ul>
    </div>
  );
}
