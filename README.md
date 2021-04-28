# bookmanager


-----


### JpaRepository method 정리

- #### List &lt;T&gt; findAll();
  + 조건없이 해당 entity, 즉 테이블의 전체 값을 가져오는 메소드.
  + 전체 read를 List로 받아서 Heap 메모리 영역에 저장한다고 하면 OutOfMemory가 되어서 일반적으로 성능 이슈 때문에 사용하진 않는다. 


- #### List &lt;T&gt; findAll (Sort sort);
  + findAll()에 정렬값 추가


- #### List &lt;T&gt; findAllById(Iterable &lt;ID&gt; ids);
  + Id 값이 Iterable. 즉, List 타입으로 들어감.


- #### &lt;S extends T&gt; List &lt;S&gt; saveAll(Iterable &lt;S&gt; entities);
  + entity를 Iterable List 형식으로 받아서 전부다 한꺼번에 DB에 반영하도록 저장하는 메소드.


- #### void flush();
  + 현재 Jpa context에서 가지고 있는 DB값을 DB에 반영하도록 지시하는 메소드.


- #### &lt;S extends T&gt; S saveAndFlush(S entity);
  + 저장한 데이터를 Jpa context에서 가지고 있지 말고 바로 DB에 반영해서 적용할 것을 지시하는 메소드.


- #### void deleteInBatch(Iterable &lt;T&gt; entities);
  + entity를 list 형식으로 받아서 한꺼번에 지우는 메소드.


- #### void deleteAllInBatch();
  + 조건 없이 해당 entity. 즉, table을 통째로 다 지우는 메소드. 실제 로직에서는 거의 사용하지 않음.


- #### T getOne(ID id);
  + id 값을 가지고 해당 entity 값을 조회하여 하나만 가져오는 메소드.


- #### &lt;S extends T&gt; List &lt;S&gt; findAll(Example &lt;S&gt; example);
  + example을 이용하여 findAll.

-----

### PagingAndSortingRepository

- #### Iterable &lt;T&gt; findAll(Sort sort);

- #### Page &lt;T&gt; findAll(Pageable pageable);
  + Pageable 파라미터를 받아서 한꺼번에 paging을 바로 쉽게 처리.

-----

### CrudRepository
우리가 사용하는 대부분의 기본적인 메소드들이 정의되어 있음.

- #### &lt;S extends T&gt; S save(S entity);
  + entity에 대한 저장 제공.

- #### &lt;S extends T&gt; Iterable &lt;S&gt; saveAll(Iterable &lt;S&gt; entities);
  + List 타입의 entity 묶음들을 가지고 한꺼번에 저장하는 메소드.

- #### Optional &lt;T&gt; findById(ID id);
  + Optional 객체로 매핑을 해서 리턴해주는 메소드.
  + getOne과 비슷하나 동작이 조금은 다름.

- #### Boolean existById(ID id);
  + 해당 객체가 존재하는 여부 확인 메소드.

- #### long count();
  + 전체 entity 갯수 가져오는 메소드.
  + Paging 처리 시에 count() 필요.

- #### void deleteById(ID id);
- #### void delete(T entity);
  + Id에 해당하는 데이터 삭제 메소드.

-----

### QueryByExampleExecutor
- #### Example class를 활용한 조회가 좀 더 다양하게 정의

-----

### Repository
최상위 레퍼지토리
 
- #### 아무것도 없다.
- #### Jpa에서 사용하는 도메인 레퍼지토리 타입이라는 것을 알려주기 위한 인터페이스.
- #### 실제로 메서드에 대한 정의는 존재하지 않는다.
