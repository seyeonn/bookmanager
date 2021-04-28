# bookmanager

JpaRepository method 정리

List<T> findAll();

조건없이 해당 entity, 즉 테이블의 전체 값을 가져오는 메소드.
전체 read를 List로 받아서 Heap 메모리 영역에 저장한다고 하면 OutOfMemory가 되어서 일반적으로 성능 이슈 때문에 사용하진 않는다.


List<T> findAll (Sort sort);

findAll()에 정렬값 추가


List<T> findAllById(Iterable<ID> ids);

Id 값이 Iterable. 즉, List 타입으로 들어감.


<S extends T> List<S> saveAll(Iterable<S> entities);

entity를 Iterable List 형식으로 받아서 전부다 한꺼번에 DB에 반영하도록 저장하는 메소드.


void flush();

현재 Jpa context에서 가지고 있는 DB값을 DB에 반영하도록 지시하는 메소드.


<S extends T> S saveAndFlush(S entity);

저장한 데이터를 Jpa context에서 가지고 있지 말고 바로 DB에 반영해서 적용할 것을 지시하는 메소드.


void deleteInBatch(Iterable<T> entities);

entity를 list 형식으로 받아서 한꺼번에 지우는 메소드.


void deleteAllInBatch();

조건 없이 해당 entity. 즉, table을 통째로 다 지우는 메소드. 실제 로직에서는 거의 사용하지 않음.


T getOne(ID id);

id 값을 가지고 해당 entity 값을 조회하여 하나만 가져오는 메소드.


<S extends T> List<S> findAll(Example<S> example);

example을 이용하여 findAll.
