package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LocateFixed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                lineTo(5f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 12f)
                lineTo(22f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                lineTo(12f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 19f)
                lineTo(12f, 22f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 12.0f)
                arcToRelative(7.0f, 7.0f, 0f, true, false, 14.0f, 0f)
                arcToRelative(7.0f, 7.0f, 0f, true, false, -14.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.LocateFixedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LocateFixed: ImageVector
    @Composable get() = LocateFixedDefinition.asImageVector()
