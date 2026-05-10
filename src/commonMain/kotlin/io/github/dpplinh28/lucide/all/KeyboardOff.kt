package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("KeyboardOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 4f)
                arcTo(2f, 2f, 0f, false, true, 22f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 6f)
                lineTo(22f, 16.41f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 16f)
                lineTo(16f, 16f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.69f, 4f)
                lineTo(20f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 8f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 8f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 20f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 8f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.KeyboardOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.KeyboardOff: ImageVector
    @Composable get() = KeyboardOffDefinition.asImageVector()
