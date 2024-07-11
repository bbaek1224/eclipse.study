
function handleSearchClick2() {
	const searchInput2 = document.querySelector(".search-input2");
	location.href = `http://localhost:8080/dvd/producer/search?searchText=${searchInput2.value}`
}


function handleSearchClick() {
	const searchInput = document.querySelector(".search-input");
	location.href = `http://localhost:8080/dvd/search?searchText=${searchInput.value}`
}

