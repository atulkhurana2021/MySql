package Service;

import Entities.Table;
import Models.CreateTableRequest;
import Models.DeleteTableRequest;
import Repository.Repository;
import Utils.Utils;

public class DDLService {

    private Repository repository;
    private Utils utils;

    public DDLService(Repository repository) {
        this.repository = repository;
        utils = new Utils(repository);
    }

    public void createTable(CreateTableRequest createTableRequest) throws Exception {
        if (repository.getTable(createTableRequest.getName()) != null)
            throw new Exception("table already exists");
        Table table = utils.getTableObject(createTableRequest);

        repository.addTable(table);

    }

    public void deleteTable(DeleteTableRequest deleteTableRequest) throws Exception {
        if (repository.getTable(deleteTableRequest.getName()) == null)
            throw new Exception("table does not exists");
        repository.deleteTable(deleteTableRequest.getName());
    }
}
