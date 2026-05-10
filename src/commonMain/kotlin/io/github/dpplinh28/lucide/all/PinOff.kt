package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PinOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 9.34f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                horizontalLineTo(7.89f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 9f)
                verticalLineToRelative(1.76f)
                arcToRelative(2f, 2f, 0f, false, true, -1.11f, 1.79f)
                lineToRelative(-1.78f, .9f)
                arcTo(2f, 2f, 0f, false, false, 5f, 15.24f)
                verticalLineTo(16f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(11f)
            }
}

public val LucideIcons.All.PinOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PinOff: ImageVector
    @Composable get() = PinOffDefinition.asImageVector()
