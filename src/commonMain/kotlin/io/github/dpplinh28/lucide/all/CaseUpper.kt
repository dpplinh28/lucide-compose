package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CaseUpper") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 11f)
                horizontalLineToRelative(4.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 5f)
                horizontalLineToRelative(-4f)
                arcToRelative(.5f, .5f, 0f, false, true, -.5f, -.5f)
                verticalLineToRelative(-9f)
                arcToRelative(.5f, .5f, 0f, false, true, .5f, -.5f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 16f)
                lineToRelative(4.039f, -9.69f)
                arcToRelative(.5f, .5f, 0f, false, true, .923f, 0f)
                lineTo(11f, 16f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.304f, 13f)
                horizontalLineToRelative(6.392f)
            }
}

public val LucideIcons.All.CaseUpperDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CaseUpper: ImageVector
    @Composable get() = CaseUpperDefinition.asImageVector()
