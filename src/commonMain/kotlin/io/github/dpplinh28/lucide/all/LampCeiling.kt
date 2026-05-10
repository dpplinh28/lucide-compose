package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LampCeiling") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.829f, 15.998f)
                arcToRelative(3f, 3f, 0f, true, true, -5.658f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.92f, 14.606f)
                arcTo(1f, 1f, 0f, false, true, 20f, 16f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -.92f, -1.394f)
                lineToRelative(3f, -7f)
                arcTo(1f, 1f, 0f, false, true, 7f, 7f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, true, .92f, .606f)
                close()
            }
}

public val LucideIcons.All.LampCeilingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LampCeiling: ImageVector
    @Composable get() = LampCeilingDefinition.asImageVector()
