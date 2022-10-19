package com.esprit.billingservice.mappers;

import com.esprit.billingservice.entities.Invoice;
import com.esprit.billingservice.dto.InvoiceRequestDTO;
import com.esprit.billingservice.dto.InvoiceResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {
    InvoiceResponseDTO invoiceToInvoiceDTO(Invoice invoice);
    Invoice invoiceDTOtoInvoice(InvoiceRequestDTO invoiceRequestDTO);
}
