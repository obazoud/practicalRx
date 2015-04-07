package org.dogepool.practicalrx.services;

import org.dogepool.practicalrx.domain.User;
import org.springframework.stereotype.Service;
import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * Service for getting info on coins mined by users.
 */
@Service
public class CoinService {

    public Observable<Long> totalCoinsMinedBy(User user) {
        if (user.equals(User.OTHERUSER)) {
            return Observable.just(12L);
        }
        return Observable.just(0L);
        //TODO how to re-add the notion of separate thread?
    }
}
