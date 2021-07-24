package com.himalaya.catalogservice.service;

import com.himalaya.catalogservice.jpa.CatalogEntity;

public interface CatalogService {

    Iterable<CatalogEntity> getAllCatalogs();
}
