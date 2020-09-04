package tech.gebel.piggybank.repositories;

import org.springframework.data.repository.CrudRepository;

import tech.gebel.piggybank.models.Coin;

public interface CoinRepository extends CrudRepository<Coin, Long> {
}
