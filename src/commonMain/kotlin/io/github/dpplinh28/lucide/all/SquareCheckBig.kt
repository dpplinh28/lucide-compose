package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareCheckBig") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 10.656f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12.344f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 11f)
                lineToRelative(3f, 3f)
                lineTo(22f, 4f)
            }
}

public val LucideIcons.All.SquareCheckBigDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareCheckBig: ImageVector
    @Composable get() = SquareCheckBigDefinition.asImageVector()
