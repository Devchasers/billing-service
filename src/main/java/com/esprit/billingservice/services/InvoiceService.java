package com.esprit.billingservice.services;

import com.esprit.billingservice.dto.InvoiceRequestDTO;
import com.esprit.billingservice.dto.InvoiceResponseDTO;

import java.util.List;

public interface InvoiceService {
 InvoiceResponseDTO getInvoice(String id);
 List<InvoiceResponseDTO> listInvoices();
 InvoiceResponseDTO newInvoice(InvoiceRequestDTO invoiceRequestDTO);
}
