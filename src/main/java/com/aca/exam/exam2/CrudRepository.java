package com.aca.exam.exam2;

import org.jetbrains.annotations.Nullable;

import java.io.FileNotFoundException;
import java.util.List;

public interface CrudRepository<ENTITY, ID>  {
    @Nullable
    ENTITY findById(ID id) throws FileNotFoundException;
    List<ENTITY> findAll() throws FileNotFoundException;
}
