package guru.springframework.spring5mongorecipeapp.services;

import guru.springframework.spring5mongorecipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
