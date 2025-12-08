document.addEventListener('DOMContentLoaded', () => {
  const btnFromAvatar = document.getElementById('menuCriarEventoFromAvatar');
  const modalEl = document.getElementById('modalEvento'); // id no seu modal de evento
  const modal = modalEl ? new bootstrap.Modal(modalEl) : null;

  btnFromAvatar?.addEventListener('click', () => {
    modal?.show();
  });
});
