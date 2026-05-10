package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cookie") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                arcToRelative(10f, 10f, 0f, true, false, 10f, 10f)
                arcToRelative(4f, 4f, 0f, false, true, -5f, -5f)
                arcToRelative(4f, 4f, 0f, false, true, -5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f, 8.5f)
                verticalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 15.5f)
                verticalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                verticalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 17f)
                verticalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 14f)
                verticalLineToRelative(.01f)
            }
}

public val LucideIcons.All.CookieDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cookie: ImageVector
    @Composable get() = CookieDefinition.asImageVector()
