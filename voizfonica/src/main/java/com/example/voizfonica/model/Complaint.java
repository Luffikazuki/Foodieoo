package com.example.voizfonica.model;


import lombok.Data;

import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;


@Data
@Document
public class Complaint {

    @Id
    private static String id;

    @Size(max=10,message="Enter a valid mobile number")
    private String mobileNumber;

    @NotNull(message="Please select one")
    private String queryType;

    @NotBlank(message="Enter Complaint to submit")
    @Size(max=500)
    private String queryByUser;

    private static long ticket=100;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public static long getTicket() {
        return ticket;
    }

    public static void setTicket(long ticket) {
        Complaint.ticket = ticket;
    }
}
