import java.util.*;

public class BillHeader
{
private Date issueDate;
private Date dueDate;
private Double originalAmount;
private Double amountOutstanding;
public Date getIssueDate() {
return issueDate;
}
public void setIssueDate(Date issueDate) {
this.issueDate = issueDate;
}
public Date getDueDate() {
return dueDate;
}
public void setDueDate(Date dueDate) {
this.dueDate = dueDate;
}
public Double getOriginalAmount() {
return originalAmount;
}
public void setOriginalAmount(Double originalAmount) {
this.originalAmount = originalAmount;
}
public Double getAmountOutstanding() {
return amountOutstanding;
}
public void setAmountOutstanding(Double amountOutstanding) {
this.amountOutstanding = amountOutstanding;
}
}