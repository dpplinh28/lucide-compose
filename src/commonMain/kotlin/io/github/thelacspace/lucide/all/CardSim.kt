package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CardSim") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 14f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.172f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, .586f)
                lineToRelative(3.828f, 3.828f)
                arcTo(2f, 2f, 0f, false, true, 20f, 7.828f)
                verticalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 14f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 10.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.CardSimDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CardSim: ImageVector
    @Composable get() = CardSimDefinition.asImageVector()
