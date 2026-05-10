package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareFunction") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, 2.0f, -2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 17f)
                curveToRelative(2f, 0f, 2.8f, -1f, 2.8f, -2.8f)
                verticalLineTo(10f)
                curveToRelative(0f, -2f, 1f, -3.3f, 3.2f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 11.2f)
                horizontalLineToRelative(5.7f)
            }
}

public val LucideIcons.All.SquareFunctionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareFunction: ImageVector
    @Composable get() = SquareFunctionDefinition.asImageVector()
