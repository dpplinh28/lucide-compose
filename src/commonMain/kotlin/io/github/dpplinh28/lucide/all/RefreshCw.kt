package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RefreshCw") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, -9f)
                arcToRelative(9.75f, 9.75f, 0f, false, true, 6.74f, 2.74f)
                lineTo(21f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, false, true, -9f, 9f)
                arcToRelative(9.75f, 9.75f, 0f, false, true, -6.74f, -2.74f)
                lineTo(3f, 16f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 16f)
                horizontalLineTo(3f)
                verticalLineToRelative(5f)
            }
}

public val LucideIcons.All.RefreshCwDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RefreshCw: ImageVector
    @Composable get() = RefreshCwDefinition.asImageVector()
