package Model;

import java.time.LocalDate;
import java.util.Date;

public class Contract {
  private Date contractDate;
  private Integer contractNumber;
  private Integer contractValue;
  private Integer numberInstallments;


  public Contract() {
  }

  public Contract(Date contractDate, Integer contractNumber, Integer contractValue, Integer numberInstallments) {
    this.contractDate = contractDate;
    this.contractNumber = contractNumber;
    this.contractValue = contractValue;
    this.numberInstallments = numberInstallments;
  }

  public Date getContractDate() {
    return contractDate;
  }

  public void setContractDate(Date contractDate) {
    this.contractDate = contractDate;
  }

  public Integer getContractNumber() {
    return contractNumber;
  }

  public void setContractNumber(Integer contractNumber) {
    this.contractNumber = contractNumber;
  }

  public Integer getContractValue() {
    return contractValue;
  }

  public void setContractValue(Integer contractValue) {
    this.contractValue = contractValue;
  }
  public Integer getNumberInstallments() {
    return numberInstallments;
  }

  public void setNumberInstallments(Integer numberInstallments) {
    this.numberInstallments = numberInstallments;
  }

  public Double installments(int index) {
    double averageContractValue = (double) getContractValue() / getNumberInstallments();
    double simpleInterestRate = averageContractValue * 0.01 * index;
    return simpleInterestRate + 0.02;
  }
}
