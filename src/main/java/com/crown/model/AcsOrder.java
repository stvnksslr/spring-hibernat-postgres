package com.crown.model;

        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.Id;
        import javax.persistence.Table;

@Entity
@Table(name="acsorders")
public class AcsOrder {

    @Id
    @GeneratedValue
    private Integer id;
    private String orderdata;
 //   private Boolean processed;
 //   private Date  dateprocessed;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderdata() {
        return orderdata;
    }
    public void setOrderdata(String orderdata) {
        this.orderdata = orderdata;
    }

 //   public Integer getprocessed() {
 //       return getprocessed();
 //   }
 //   public void setProcessed(Boolean processed) {
 //       this.processed = processed;
 //   }

 //   public Date getDateprocessed() { return dateprocessed; }
 //   public void setDateprocessed(Date dateprocessed) {
  //      this.dateprocessed = dateprocessed;
  //  }
}

