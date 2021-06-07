public class Address
{
private String line1;
private String line2;
private String city;
private String country;
private int zipCode;
public String getLine1() {
return line1;
}
public void setLine1(String line1) {
this.line1 = line1;
}
public String getLine2() {
return line2;
}
public void setLine2(String line2) {
this.line2 = line2;
}
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
public String getCountry() {
return country;
}
public void setCountry(String country) {
this.country = country;
}
public int getZipCode() {
return zipCode;
}
public void setZipCode(int zip) {
this.zipCode = zip;
}
public String toString()
{
StringBuilder sb = new StringBuilder("Address Details :\n");
sb.append(this.getLine1() + ",");
sb.append("\n");
sb.append(this.getLine2()+",");
sb.append("\n");
sb.append(this.getCity() + " - " );
sb.append(this.getZipCode());
sb.append("\n");
sb.append(this.getCountry());
return sb+"";
}
}