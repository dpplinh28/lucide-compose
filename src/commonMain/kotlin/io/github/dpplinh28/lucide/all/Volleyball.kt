package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Volleyball") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.1f, 7.1f)
                arcToRelative(16.55f, 16.55f, 0f, false, true, 10.9f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                arcToRelative(12.6f, 12.6f, 0f, false, true, -8.7f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.8f, 13.6f)
                arcToRelative(16.55f, 16.55f, 0f, false, true, -9f, 7.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.7f, 17f)
                arcToRelative(12.8f, 12.8f, 0f, false, false, -8.7f, -5f)
                arcToRelative(13.3f, 13.3f, 0f, false, true, 0f, -10f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.3f, 3.8f)
                arcToRelative(16.55f, 16.55f, 0f, false, false, 1.9f, 11.5f)
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
