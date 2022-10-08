package Model;

import java.util.Objects;

public class Client {
  private String name;
  private String email;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Client client)) return false;
    return getName().equals(client.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName());
  }

  public Client() {
  }

  public Client(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}