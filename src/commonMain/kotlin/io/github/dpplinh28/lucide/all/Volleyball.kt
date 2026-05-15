package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Volleyball") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 7f)
                arcToRelative(16f, 16f, 20f, false, true, 10.98f, 4.362f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                arcToRelative(13f, 13f, 0f, false, true, -8.66f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.83f, 13.634f)
                arcToRelative(16f, 16f, 0f, false, true, -9.267f, 7.328f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.66f, 17f)
                arcTo(13f, 13f, 0f, false, false, 12f, 12f)
                arcToRelative(13f, 13f, 0f, false, true, 0f, -10f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.17f, 15.366f)
                arcToRelative(16f, 16f, 0f, false, true, -1.713f, -11.69f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
}

public val LucideIcons.All.VolleyballDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Volleyball: ImageVector
    @Composable get() = VolleyballDefinition.asImageVector()
