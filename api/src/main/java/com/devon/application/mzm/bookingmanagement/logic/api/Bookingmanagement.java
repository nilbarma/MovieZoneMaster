package com.devon.application.mzm.bookingmanagement.logic.api;

import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindAuditorium;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindBooking;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindMovie;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindScreening;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindSeat;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindSeatBooked;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindTheatre;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindUser;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageAuditorium;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageBooking;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageMovie;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageScreening;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageSeat;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageSeatBooked;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageTheatre;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageUser;

/**
 * Interface for Bookingmanagement component.
 */
public interface Bookingmanagement extends UcFindAuditorium, UcManageAuditorium, UcFindBooking, UcManageBooking,
    UcFindMovie, UcManageMovie, UcFindScreening, UcManageScreening, UcFindSeatBooked, UcManageSeatBooked, UcFindSeat,
    UcManageSeat, UcFindTheatre, UcManageTheatre, UcFindUser, UcManageUser {

}
