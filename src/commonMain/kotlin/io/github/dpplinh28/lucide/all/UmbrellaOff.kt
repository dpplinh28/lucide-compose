package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UmbrellaOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 13f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.656f, 13f)
                horizontalLineToRelative(2.336f)
                arcToRelative(1f, 1f, 0f, false, false, .97f, -1.274f)
                arcToRelative(10.284f, 10.284f, 0f, false, false, -12.07f, -7.51f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.961f, 5.957f)
                arcToRelative(10.28f, 10.28f, 0f, false, false, -3.922f, 5.769f)
                arcTo(1f, 1f, 0f, false, false, 3f, 13f)
                horizontalLineToRelative(10f)
            }
}

public val LucideIcons.All.UmbrellaOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UmbrellaOff: ImageVector
    @Composable get() = UmbrellaOffDefinition.asImageVector()
