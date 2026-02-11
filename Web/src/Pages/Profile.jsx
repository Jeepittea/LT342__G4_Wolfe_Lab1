import Sidebar from "../components/Sidebar";

export default function Profile() {
  // For now, hardcode or load from API/localStorage
  const user = {
    firstName: "Justin",
    lastName: "Lara",
    username: "justin_lara@gmail.com"
  };

  return (
    <div style={{ display: "flex" }}>
      <Sidebar />

      <div style={{ padding: "40px" }}>
        <h1>Profile</h1>
        <p>Profile details will be shown here.</p>

        <p><b>Name:</b> {user.firstName} {user.lastName}</p>
        <p><b>Email:</b> {user.username}</p>
      </div>
    </div>
  );
}
