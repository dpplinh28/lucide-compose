package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Landmark") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 18f)
                verticalLineToRelative(-7f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.119f, 2.205f)
                arcToRelative(2f, 2f, 0f, false, true, 1.762f, 0f)
                lineToRelative(7.84f, 3.846f)
                arcTo(.5f, .5f, 0f, false, true, 20.5f, 7f)
                horizontalLineToRelative(-17f)
                arcToRelative(.5f, .5f, 0f, false, true, -.22f, -.949f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 18f)
                verticalLineToRelative(-7f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 18f)
                verticalLineToRelative(-7f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 22f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 18f)
                verticalLineToRelative(-7f)
            }
}

public val LucideIcons.All.LandmarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Landmark: ImageVector
    @Composable get() = LandmarkDefinition.asImageVector()
