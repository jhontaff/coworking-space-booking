package backend.ecommerce.ecommerceapi.service.booking;

import backend.ecommerce.ecommerceapi.entity.booking.Booking;

import java.time.LocalDateTime;
import java.util.List;

public interface BookingService {

    public List<Booking> getAllBookings();

    public List<Booking> getUserBookings(Long userId);

    public List<Booking> getApprovedBookings();

    public List<Booking> getPendingBookings();

    public List<Booking> getCancelledBookings();

    public List<Booking> getRejectedBookings();

    public List<Booking> getDoneBookings();

    public void updateBookingState();

    public Boolean isRoomAvailable(Long roomId, LocalDateTime checkIn, LocalDateTime checkOut);

    public Booking getBookingById(Long bookingId);

    public void validateDateBooking(Booking booking);

    public void updateExtraResource(Long extraResourceId);

    public void createBooking(Booking booking);

    public void changeRoom(Long bookingId, Long newRoomId);

    public void changeBookingState(Long bookingId, Long newBookingStateId);

    public void changeCheckInDate(Long bookingId, LocalDateTime newCheckInDate);

    public void changeCheckOutDate(Long bookingId, LocalDateTime newCheckOutDate);

    public void changeOwner(Long bookingId, Long newUserId);

}
