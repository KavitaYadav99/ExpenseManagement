package com.adt.expensemanagement.services.interfaces;

import com.adt.expensemanagement.models.GSTInvoice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GSTInvoiceService {

    void save(GSTInvoice gstInvoice);

    GSTInvoice findById(Long id);

    List<GSTInvoice> findAll();

    Page<GSTInvoice> findAll(Pageable pageable);

    public GSTInvoice update(GSTInvoice invoice);

    GSTInvoice findByInvoiceNumber(String invoiceNumber);

    int deleteByInvoiceNumber(String invoiceNumber);
}

