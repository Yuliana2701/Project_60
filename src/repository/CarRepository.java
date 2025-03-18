package repository;

import model.Car;
import utils.MyList;

/*
CRUD - операции
Create - (создание) - добавление новых данных(новые обьекты сущностей) в DATA
Read - чтение(получение)данных из хранилища
Update(бновление) - изменение существующих данных
Delete (удаление) - удаление обьекта
 */

public interface CarRepository {

    // Create - add
    Car addCar(String model, int year, double price);

    // READ

    // получить список всех машин
    MyList<Car> gettAllCars();

    // получение сущности по id
    Car getById(int id);

    // Получить список только свободных машин

    // получить список машин по модели
    MyList<Car> getCarsByModel(String model);

    // Update
    // Сохранить обновленный объект
    void saveCar(Car car);

    // Delete
    void deleteById(int id);





}