package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SignpostBig") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 9f)
                horizontalLineTo(4f)
                lineTo(2f, 7f)
                lineToRelative(2f, -2f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 5f)
                horizontalLineToRelative(6f)
                lineToRelative(2f, 2f)
                lineToRelative(-2f, 2f)
                horizontalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 22f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
                verticalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 22f)
                horizontalLineToRelative(8f)
            }
}

public val LucideIcons.All.SignpostBigDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SignpostBig: ImageVector
    @Composable get() = SignpostBigDefinition.asImageVector()
