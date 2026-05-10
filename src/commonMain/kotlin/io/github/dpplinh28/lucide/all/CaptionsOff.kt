package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CaptionsOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.5f, 5f)
                horizontalLineTo(19f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 11f)
                horizontalLineToRelative(-.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 11f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 15f)
                horizontalLineToRelative(2.5f)
            }
}

public val LucideIcons.All.CaptionsOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CaptionsOff: ImageVector
    @Composable get() = CaptionsOffDefinition.asImageVector()
