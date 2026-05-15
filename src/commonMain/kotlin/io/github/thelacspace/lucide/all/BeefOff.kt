package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BeefOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.771f, 6.109f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 3.12f, 3.12f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.852f, 12.185f)
                arcToRelative(6.5f, 6.5f, 0f, false, false, -9.035f, -9.04f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.013f, 18.013f)
                curveTo(15.029f, 20.349f, 10.831f, 22f, 7f, 22f)
                arcToRelative(3f, 3f, 0f, false, true, -2.68f, -1.66f)
                lineTo(2.4f, 16.5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18.5f, 6f)
                lineToRelative(2.19f, 4.5f)
                arcToRelative(6.48f, 6.48f, 0f, false, true, -.139f, 4.393f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.355f, 6.37f)
                arcToRelative(7f, 7f, 0f, false, false, -.075f, .23f)
                curveToRelative(-1.1f, 3.13f, -.78f, 3.9f, -3.18f, 6.08f)
                arcTo(3f, 3f, 0f, false, false, 5f, 18f)
                curveToRelative(3.356f, 0f, 6.993f, -1.267f, 9.85f, -3.151f)
            }
}

public val LucideIcons.All.BeefOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BeefOff: ImageVector
    @Composable get() = BeefOffDefinition.asImageVector()
