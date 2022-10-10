package Model;

import java.util.Date;

public class ClientU implements Comparable<ClientU>{

  private String name;
  private Date date;

  public ClientU(String name, Date date) {
    this.name = name;
    this.date = date;
  }

  public ClientU() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  @Override
  public int compareTo(ClientU other) {
    return name.compareTo(other.getName());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ClientU clientU)) return false;

    return getName() != null ? getName().equals(clientU.getName()) : clientU.getName() == null;
  }

  @Override
  public int hashCode() {
    return getName() != null ? getName().hashCode() : 0;
  }
}
